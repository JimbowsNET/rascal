module experiments::Concept::Fca
import IO;
import String;
import List;
import Set;
import Map;
import Relation;
import experiments::Concept::Types;
import vis::Figure;


@doc{Read object attribute in .cxt format.}   
public property_table readCxt(loc input)  {
    list[str] d = readFileLines(input);
    map[str, set[str]] vb1 = ();
    int nRows = toInt(d[2]);
    int nCols = toInt(d[3]);
    int start = 5+nRows+nCols;
    list[str] e = tail(d, size(d)-start);
    int idx = 5;
    for (str f <- e) {
         set[str] b = {d[5+nRows+i]|int i<-[0, 1..(size(f)-1)], charAt(f,i)==88};
         vb1[d[idx]] = b;
         idx = idx+1;
         }
    return <vb1, rinv(vb1)>;
    }
    
    
    @doc{Create Lattice Figure from Property Table}
 public Figure createLatticeFigure(property_table vb) {
     rel[concept_t, concept_t] q = createLattice(vb);
     map[concept_t, int] z = makeNodes(q);
     set[concept_t] d = domain(z);
     Figures nodes = [];
     for (concept_t c <- d) {
       set[str] a0 = newAdded0(q, c);
       set[str] a1 = newAdded1(q, c);
       str s0 = (isEmpty(a0)?"":((size(a0)==1)?getOneFrom(a0):toString(a0)));
       str s1 = (isEmpty(a1)?"":((size(a1)==1)?getOneFrom(a1):toString(a1)));
       nodes += vcat(compose(s0, s1),[id("<z[c]>"),mouseOver(box(
      text("<c[0]> <c[1]>", [fontColor("green")]), 
         [fillColor("lightgrey")]
         ))]);
     }  
     list[Edge] edges =   [ edge("<z[x[0]]>", "<z[x[1]]>", [lineWidth(1)]) | x<-q];  
     return graph( nodes, edges, [hint("lattice")]);
     }
     
// Auxilary functions
   
set[str] newAdded1(rel[concept_t, concept_t] q, concept_t c) {
     set[concept_t] parents = range(domainR(q, {c}));
     return c[1] - union({{{p[1]|concept_t p <-parents}}});
     }
 
 set[str] newAdded0(rel[concept_t, concept_t] q, concept_t c) {
     set[concept_t] parents = domain(rangeR(q, {c}));
     return c[0] - union({{{p[0]|concept_t p <-parents}}});
     }  
     
 map[concept_t, int] makeNodes(rel[concept_t, concept_t] q) {
     set[concept_t] c = carrier(q);
     int i = 0;
     map[concept_t, int] r = ();
     for (concept_t b<-c) {
          if (!(r[b])?) {
              r[b] = i;
              i=i+1;
              }
          }
     return r;
     } 
     
 Figures compose(str s1, str s2) {
     int w = 70, h = 20;
     list[FProperty] l = [width(w), height(h), fontSize(9), lineColor("black")];
     return [box(text(s1), l+fillColor("lightgrey")),
             box(text(s2), l+fillColor("lightyellow"))];
     } 