module demo::lang::Func::programs::F3

public str F3 =
"swap(a, b) =
          let 
	        temp = *a
	      in
            *a := *b;
	        *b := temp
	      end

fact(n) = let
	        x = 1,
	        y = 0
	      in
	        if n \<= 1 then 
	           x := 1
	        else 
	           x := n * fact(n-1)
	        end;
	        swap(&x, &y);
	        y
	      end";
