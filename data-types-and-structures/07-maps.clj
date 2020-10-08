(def student
  {:first-name "Jerome"
   :last-name "Eckhart"
   :age 45
   :email "jet@jerome.ca"
   :studies {:enrollments 4
             :major "Computer Science"
             :advisor-id 533}})

(get-in student [:studies :major])
(assoc-in student [:studies :foo] "bar")
(assoc-in student [:studies :advisor-id] 335)

(def u1 {"Hans" 1922, "Pria" 1972, "Yennifer" 1911})
(def u2 {"Niemi" 1622, "Jakko" 1694, "Jani" 1601})

(zipmap (keys u2) (vals u1))
(zipmap (keys u1) (vals u2))

(def sites {"Hackernews" 32, "Reddit" 567, "YouTube" 122})
;; two function implemintations 
(defn double-vals	
	([coll] 
    (zipmap (keys coll) (map #(* 2 %)(vals coll)))
  )
)

(defn double-vals1
	([coll]     
    (map #(assoc {} (first %) (* 2 (second %))) coll)
  )
)

(double-vals sites)
(double-vals1 sites)