(defn perc [x y]
		(* (/ x  y) 100)
)

(defn sphere-area [r]
		(* 4 3.14 r r)
)

(def sphere-area-inc (comp sphere-area inc))
