(map #(+ 5 %) [10 20 30 40])

(defn inc-by 
	[v n] (
		map #(+ n %) v
	)
)
(inc-by [1, 2, 3] 3)

(apply vector (concat '(1,2,3) [1,2]))

