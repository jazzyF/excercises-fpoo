(ns kapitel)
;; Section 1.18

;; Excercise 3
(def add-squares
  (fn [& numbers]
    (apply + (map * numbers numbers))))

;; Excercise 4
;; Using range and apply, implement a bizarre version of factorial that uses
;; neither iteration nor recursion
(def factorial
  (fn [n]
    (apply * (range 1 (+ n 1)))))

;; Excercise 6
;; Both arguments are sequences. Returns true if the elements
;; in the candidate are the first elements in the sequence
(def prefix-of?
  (fn [candidate sequence]
    (= candidate (take (count candidate) sequence))))

;; Excercise 7
;; (tails sequence): Returns a sequence of successively smaller subsequences of the argument.
(def tails
  (fn [sequence]
    (map drop
      (range (inc (count sequence)))
      (repeat (inc (count sequence)) sequence))))








