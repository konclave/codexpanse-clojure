(def seq '("B", "Hey", "Moi", "Hello", "Bangabaga"))
(sort-by count seq)
(sort-by #(- (count %)) seq)
(sort-by last '([3 14] [2 12] [4 6]))
(reverse seq)
(nth seq (Math/floor (/ (count seq) 2)))
(def seq1 '("B", "Hey", "Moi", "Hello"))
(split-at (Math/floor (/ (count seq1) 2)) seq1)