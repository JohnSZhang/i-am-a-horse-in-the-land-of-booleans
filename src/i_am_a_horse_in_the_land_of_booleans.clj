(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil)) false true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
     (and (== 0 (mod n 3)) (== 0 (mod n 5))) "gotcha!"
     (== 0 (mod n 3)) "fizz"
     (== 0 (mod n 5)) "buzz"
     :else ""))

(defn teen? [age]
  (if (and (<= age 19) (>= age 13)) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x) (* 2 x)
     (empty? x) nil
     (or (list? x) (vector? x)) (* (count x) 2)
      :else true))

(defn leap-year? [year]
  (cond
     (and (== 0 (mod year 100))
            (not (== (mod year 400) 0))) false
     (== (mod year 4) 0) true
     :else false))


; '_______'
