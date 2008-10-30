package org.meta_environment.rascal.ast;
import org.eclipse.imp.pdb.facts.ITree;
public abstract class CharRanges extends AbstractAST
{
  public class Range extends CharRanges
  {
/* range:CharRange -> CharRanges {cons("Range")} */
    private Range ()
    {
    }
    /*package */ Range (ITree tree, CharRange range)
    {
      this.tree = tree;
      this.range = range;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitCharRangesRange (this);
    }
    private CharRange range;
    public CharRange getrange ()
    {
      return range;
    }
    private void privateSetrange (CharRange x)
    {
      this.range = x;
    }
    public Range setrange (CharRange x)
    {
      Range z = new Range ();
      z.privateSetrange (x);
      return z;
    }
  }
  public class Ambiguity extends CharRanges
  {
    private final List < CharRanges > alternatives;
    public Ambiguity (List < CharRanges > alternatives)
    {
      this.alternatives = Collections.immutableList (alternatives);
    }
    public List < CharRanges > getAlternatives ()
    {
      return alternatives;
    }
  }
  public class Concatenate extends CharRanges
  {
/* lhs:CharRanges rhs:CharRanges -> CharRanges {cons("Concatenate"), right,memo} */
    private Concatenate ()
    {
    }
    /*package */ Concatenate (ITree tree, CharRanges lhs, CharRanges rhs)
    {
      this.tree = tree;
      this.lhs = lhs;
      this.rhs = rhs;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitCharRangesConcatenate (this);
    }
    private CharRanges lhs;
    public CharRanges getlhs ()
    {
      return lhs;
    }
    private void privateSetlhs (CharRanges x)
    {
      this.lhs = x;
    }
    public Concatenate setlhs (CharRanges x)
    {
      Concatenate z = new Concatenate ();
      z.privateSetlhs (x);
      return z;
    }
    private CharRanges rhs;
    public CharRanges getrhs ()
    {
      return rhs;
    }
    private void privateSetrhs (CharRanges x)
    {
      this.rhs = x;
    }
    public Concatenate setrhs (CharRanges x)
    {
      Concatenate z = new Concatenate ();
      z.privateSetrhs (x);
      return z;
    }
  }
  public class Lexical extends CharRanges
  {
    /* "(" CharRanges ")" -> CharRanges {bracket} */
  }
}
