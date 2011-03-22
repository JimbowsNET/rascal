module SystemAPI

import Exception;
import String;

@doc{Api to the System for example System Variables or System Commands.}

@doc{For using the char backquote in Rascal Programs without interpretation.}

public str backquote = "`";

@javaClass{org.rascalmpl.library.SystemAPI}
public str java getSystemProperty(str property);

/*
@doc{Returns content of location <loc> which is assumed a rascal program. The backquotes
will be replaced by stringquotes. And the stringquotes inside them will be escaped.}
@javaClass{org.rascalmpl.library.SystemAPI}
public str java getRascalFileContent(loc g) throws 
              UnsupportedScheme(loc file), PathNotFound(loc file), IOError(str msg);
*/
