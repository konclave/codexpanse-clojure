(def db {:user  {:level 2
                 :info {:building 43 :ext 12 :code "peas"}
                 :assets ["docs" "configs"]}
         :admin {:level 3
                 :assets ["logs" "pain"]}})

(let [{{{:keys [ext, code]} :info} :user} db]
	(println ext code))

(defn restring [hash]
		(let [{num :x 
           str :y} hash]
    (take num (repeat str))))

(restring {:x 5 :y "J"})
(restring {:x 2 :y "<!"})