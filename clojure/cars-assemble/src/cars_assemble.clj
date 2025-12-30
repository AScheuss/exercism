(ns cars-assemble)

(def cars-per-hour 221)

(defn success-rate [speed]
  (condp >= speed
    0 0
    4 1
    8 0.9
    9 0.8
    10 0.77
    0 ;;unknown if there are other rates so just set 0
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
