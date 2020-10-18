(let [[p e t] "pet"]
  (map clojure.string/upper-case [p e t]))

(let [[v2 [v2url v2text] v3 [v3url v3text]] ["v2" ["https://go.io" "rf23fgg"] "v3" ["https://beta.go.io" "2k32k23k"]]]
  (println [[v2 v2url v2text] [v3 v3url v3text]]))
