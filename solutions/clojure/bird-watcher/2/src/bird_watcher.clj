(ns bird-watcher)

(def busy-day-threshold 5)

(def last-week [0 2 5 3 7 8 4]
  )

(defn today [birds]
  (last birds)
  ;; could also use peek but this is not too relevant for small vectors (7 is small)
  )

(defn inc-bird [birds]
  (assoc birds (dec(count birds)) (inc (today birds)))
  )

(defn day-without-birds? [birds]
  (or (some #(= 0 %) birds) false)
  )

(defn n-days-count [birds n]
  (reduce + (take birds n))
  )

(defn busy-days [birds]
  (count (filter #(< 4 %) birds))
  )

(defn odd-week? [birds]
  (or (= [0 1 0 1 0 1 0] birds) (= [1 0 1 0 1 0 1] birds))
  )
