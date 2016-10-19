(ns aeskilson.core
  (:gen-class))

(defn fib
  "Lazily produces a list of Fibonacci numbers by creating an iterator of
  Fibonacci number pairs. `iterate` takes a function and a first element,
  then all successive values of the iterator are created by calling the
  function on the most recent value: x, (f x), (f (f x)), ...
  `map` can operate lazily too, and `take` realizes the first n elements
  of a lazy collection. So we have [0 1], [1 1], [1 2], [2 3], [3 5]...
  and then take the first element form each pair up to 100 times to realize
  our list. We also use the handy `N` suffix to ensure we use java Bigints
  to avoid overflow."
  [n]
  (take n (map first (iterate 
                       (fn [[a b]] [b (+ a b)]) ; our iterator function
                       [0N 1N]))))              ; our initial element

(defn -main
  [& args]
  (let [n (first (map read-string args))]
    (println (fib n))))
