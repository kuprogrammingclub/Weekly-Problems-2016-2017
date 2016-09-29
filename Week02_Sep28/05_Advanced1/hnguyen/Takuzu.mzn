int: n = 12;

array[1..n,1..n] of int: data = array2d(1..n, 1..n,
[
0,X,X,X,X,1,1,X,X,0,X,X,
X,X,X,1,X,X,X,0,X,X,X,X,
X,0,X,X,X,X,1,X,X,X,0,0,
1,X,X,1,X,X,1,1,X,X,X,1,
X,X,X,X,X,X,X,X,X,1,X,X,
0,X,0,X,X,X,1,X,X,X,X,X,
X,X,X,X,0,X,X,X,X,X,X,X,
X,X,X,X,0,1,X,0,X,X,X,X,
X,X,0,0,X,X,0,X,0,X,X,0,
X,X,X,X,X,1,X,X,X,X,1,X,
1,0,X,0,X,X,X,X,X,X,X,X,
X,X,1,X,X,X,X,1,X,X,0,0
]);

int: X = 2;

array[1..n,1..n] of var 0..1: x;

% solve satisfy;
solve :: int_search(
        [x[i,j] | i,j in 1..n], 
        max_regret, 
        indomain_max, 
        complete) 
    satisfy;

constraint 
  % copy the hints
  forall(i in 1..n, j in 1..n) (
      if data[i,j] != X then
        x[i,j] = data[i,j]
      else 
        true
      endif
  )
  
  /\ % rows
  forall(i in 1..n) (
    sum([x[i,j] | j in 1..n]) = n / 2
    /\
    forall(j in 1..n-2) (
      x[i,j]+x[i,j+1]+x[i,j+2] <= 2
    )
  )

  /\ % columns
  forall(j in 1..n) (
    sum([x[i,j] | i in 1..n]) = n / 2
    /\
    forall(i in 1..n-2) (
      x[i,j]+x[i+1,j]+x[i+2,j] <= 2
    )
  )
;

output 
[
  if j = 1 then "\n" else " " endif ++
  show(x[i,j])
  | i, j in 1..n
];