(ns kapitel)
;; Given starter code
(def point {:x 1, :y 2, :__class_symbol__ 'Point})

(def Point
     (fn [x y]
       {:x x,
        :y y
        :__class_symbol__ 'Point}))

(def x :x)
(def y :y)
(def class-of :__class_symbol__)

(def shift
     (fn [this xinc yinc]
       (Point (+ (x this) xinc)
              (+ (y this) yinc))))

(def Triangle
     (fn [point1 point2 point3]
       {:point1 point1, :point2 point2, :point3 point3
        :__class_symbol__ 'Triangle}))


(def right-triangle (Triangle (Point 0 0)
                              (Point 0 1)
                              (Point 1 0)))

(def equal-right-triangle (Triangle (Point 0 0)
                                    (Point 0 1)
                                    (Point 1 0)))

(def different-triangle (Triangle (Point 0 0)
                                  (Point 0 10)
                                  (Point 10 0)))
;; End starter code


;; Excercise 1
;; Implement an add function that adds two points, producing a third. First implement it without using
;; shift. Then implement it using shift. (If you think of add as an instance method, calling shift is
;; like using another instance method in the same class.)

(def add
  (fn [this other]
    (Point (+ (x this) (x other))
           (+ (y this) (y other)))))

(def add-using-shift
  (fn [this other]
    (shift this (x other) (y other))))

;; Excercise 2
(def make
  (fn [point x y]
    (point x y)))

(defn make
  [callable & points]
  (apply callable points))

;; Excercise 3
(defn equal-triangles?
  [t1 t2]
  (= t1 t2))

;; Excercise 4
(def equal-triangles? =)


