(require '[clojure.string :as str])

(defn rev-addr [email]
  (let [[uname domain] (str/split email #"@")]
    (let [[flevel slevel] (str/split domain #"\.")]
      (apply str [flevel "@" uname "." slevel]))))

(def users (atom {"Kane" "kane@ucl.ca"
            "Jerlamarel" "isee@you.com"
                  "Jun" nil}))

(swap! users assoc "Jerlamarel" (rev-addr (get (deref users) "Jerlamarel")))


(zipmap
  (keys @users)
  (pmap
    (fn [user] (rev-addr (second user)))
    @users))
