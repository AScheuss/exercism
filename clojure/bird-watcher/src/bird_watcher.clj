(ns bird-watcher)

(def busy-day-threshold 5)

(def last-week [0 2 5 3 7 8 4]
  )

(defn today [birds]
  (last birds)
  ;; could also use peek but this is not too relevant for small vectors (7 is small)
  )

(defn inc-bird [birds]
  (update birds (dec (count birds)) inc)
  )

(defn day-without-birds? [birds]
  (not (every? pos? birds))
  ;; my first version
  ;; (or (some #(= 0 %) birds) false)
  ;; another interesting solution I've seen
  ;; (> (count (filter zero? birds)) 0))
  )

(defn n-days-count [birds n]
  (reduce + (take n birds))
  )

(defn busy-days [birds]
  (count (filter #(<= busy-day-threshold %) birds))
  )

(defn odd-week? [birds]
  (or (= [0 1 0 1 0 1 0] birds) (= [1 0 1 0 1 0 1] birds))
  )
