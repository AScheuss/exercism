(ns cars-assemble)

(def cars-per-hour 221)

(defn success-rate [speed]
  (cond (== speed 0) 0
        (< speed 5) 1
        (and (> speed 4) (< speed 9)) 0.9
        (== speed 9) 0.8
        (== speed 10) 0.77
        )
  )

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (* cars-per-hour speed (success-rate speed))
  )

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (if (== 0 speed) 0
     (int (/ (production-rate speed) 60)))
  )
