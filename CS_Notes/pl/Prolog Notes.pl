%use "%" to comment
%"A:-B" B implies A 
myreverse([],B,B).
myreverse([A|L],D,B):-myreverse(L,[A|D],B).
ownreverse(A,B):-myreverse(A,[],B).

mypop([A],[],A).
mypop([A|X],[A|Y],Z):-mypop(X,Y,Z).%removes last element

removefirst([A|B],B,A).%removes first element and returns remaining list

palindrome([A]).
palindrome([A|[A]]).
palindrome([A|B]):-ownreverse(B,C),removefirst(C,X,A),palindrome(X).

palindrome([A]).
palindrome([A|[A]]).
palindrome([A|B]):-mypop(B,X,A),palindrome(X).

mymember([A|[]],A).
mymember([A|L],X):-mymember(L,X);A=X.%use ";" for or