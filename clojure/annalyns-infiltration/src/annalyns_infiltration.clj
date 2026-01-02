(ns annalyns-infiltration)

(def knight-awake? true)

(defn can-fast-attack? [knight-awake?]
  ;;"Returns true if a fast-attack can be made, false otherwise." 
  (not knight-awake?)
  )

(defn can-spy? [knight-awake? archer-awake? prisoner-awake?] 
  "Returns true if the kidnappers can be spied upon, false otherwise."
  (or knight-awake? archer-awake? prisoner-awake?)
  )

(defn can-signal-prisoner? [archer-awake? prisoner-awake?]
  "Returns true if the prisoner can be signalled, false otherwise." 
  (and prisoner-awake? (not archer-awake?))
  )

(defn can-free-prisoner? [knight-awake? archer-awake? prisoner-awake? dog-present?]
  "Returns true if prisoner can be freed, false otherwise."
  (or (and (and dog-present? (or (not knight-awake?) 
                                 (not archer-awake?)))
           (not (and dog-present? archer-awake?)))
      (and prisoner-awake? (and (not knight-awake?) (not archer-awake?) (not dog-present?))))
  )
