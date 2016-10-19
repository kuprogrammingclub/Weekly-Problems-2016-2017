(ns aeskilson.core
  (:gen-class))

(defn hand-reduce
  "The one, the only, reduce. Takes a function, an accumulator value, and
  a collection. Recursively applies the function to the accumulator and the
  first value of the collection until the collection is empty. This can be
  thought of as traversing a tree and replacing each node with a function
  to apply, and then evaluating the tree, e.g. (1 , 2 , 3) -> (1 + 2 + 3).
  Clojure folks call it reduce, Haskell folks call it fold-left."
  [func accum coll]
  (if (seq coll) ; A Clojure-y way of asking if a collection is not empty
    (hand-reduce func (func accum (first coll)) (rest coll))
    accum))

(defn -main
  "Accepts a space-delimited list of integers, sums them using hand-implemented
  reduce, standard-library reduce, and apply"
  [& args]
  (let [int-list (map read-string args)]
    (println (str "Hand-Reduce: " (hand-reduce + 0 int-list)))
    (println (str "Reduce: " (reduce + int-list)))
    (println (str "Apply: " (apply + int-list)))))
