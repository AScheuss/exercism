(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (def basic_rate (* 221 speed))
  (cond (< speed 5) basic_rate
        (and (> speed 4) (< speed 9)) (* basic_rate 0.9)
        (== speed 9) (* basic_rate 0.8)
        (== speed 10) (* basic_rate 0.77)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (if (== 0 speed) 0
     (int (/ (production-rate speed) 60)))
  )
