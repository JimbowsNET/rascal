package org.meta_environment.rascal.ast;
import org.eclipse.imp.pdb.facts.ITree;
public abstract class Toplevel extends AbstractAST
{
  public class GivenVisibility extends Toplevel
  {
/* visibility:Visibility declaration:Declaration -> Toplevel {cons("GivenVisibility")} */
    private GivenVisibility ()
    {
    }
    /*package */ GivenVisibility (ITree tree, Visibility visibility,
				  Declaration declaration)
    {
      this.tree = tree;
      this.visibility = visibility;
      this.declaration = declaration;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitToplevelGivenVisibility (this);
    }
    private Visibility visibility;
    public Visibility getvisibility ()
    {
      return visibility;
    }
    private void privateSetvisibility (Visibility x)
    {
      this.visibility = x;
    }
    public GivenVisibility setvisibility (Visibility x)
    {
      GivenVisibility z = new GivenVisibility ();
      z.privateSetvisibility (x);
      return z;
    }
    private Declaration declaration;
    public Declaration getdeclaration ()
    {
      return declaration;
    }
    private void privateSetdeclaration (Declaration x)
    {
      this.declaration = x;
    }
    public GivenVisibility setdeclaration (Declaration x)
    {
      GivenVisibility z = new GivenVisibility ();
      z.privateSetdeclaration (x);
      return z;
    }
  }
  public class Ambiguity extends Toplevel
  {
    private final List < Toplevel > alternatives;
    public Ambiguity (List < Toplevel > alternatives)
    {
      this.alternatives = Collections.immutableList (alternatives);
    }
    public List < Toplevel > getAlternatives ()
    {
      return alternatives;
    }
  }
  public class DefaultVisibility extends Toplevel
  {
/* declaration:Declaration -> Toplevel {cons("DefaultVisibility")} */
    private DefaultVisibility ()
    {
    }
    /*package */ DefaultVisibility (ITree tree, Declaration declaration)
    {
      this.tree = tree;
      this.declaration = declaration;
    }
    public IVisitable accept (IASTVisitor visitor)
    {
      return visitor.visitToplevelDefaultVisibility (this);
    }
    private Declaration declaration;
    public Declaration getdeclaration ()
    {
      return declaration;
    }
    private void privateSetdeclaration (Declaration x)
    {
      this.declaration = x;
    }
    public DefaultVisibility setdeclaration (Declaration x)
    {
      DefaultVisibility z = new DefaultVisibility ();
      z.privateSetdeclaration (x);
      return z;
    }
  }
}
