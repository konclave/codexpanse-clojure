(defn is-prime? [num]
  (cond
    (= 0 num) true
    (= 1 num) true
    (even? num) false
    :otherwise (= 0
                  (count
                    (filter #(= 0 %)
                      (map #(mod num %)
                        (range 3 num)))))))

(for [n (range)
  :when(is-prime? n)
  :while(> 33 (* n n))] n)

(defn sum-digits [n]
  (+ (+ (int (/ n 100)) (int (/ (mod n 100) 10))) (mod n 10)))

(for [n (range 100 1000)
  :when(and (is-prime? n) (even? (sum-digits n)))] n)

(filter #(and
    (is-prime? %)
    (even? (sum-digits %)))
      (range 100 1000))
