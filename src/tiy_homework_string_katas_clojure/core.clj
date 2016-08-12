(ns tiy-homework-string-katas-clojure.core)
(require '[clojure.string :as str])

(defn -main []

  ;; This is Explode
  (defn explode [text]
    (println (str "(missing-char \"" text "\") -> ")
             (for [x (range 0 (count text))]
               (if (<= (count text) 1)
                 (str text)
                 (str/trim (str (.charAt text x) " "))))))
  (explode "example")
  (explode "cat")
  (explode "")
  (explode "c")
  (explode "This")
  (explode "dude")
  (explode "rage")
  (explode "on")



  ;; This is the not string
  (defn not-string [text]
    (if (.startsWith text "not")
      (println text)
      (println "not" text)))
  (print "(not-string \"candy\") -> ") (not-string "candy")
  (print "(not-string \"x\") -> ") (not-string "x")
  (print "(not-string \"not bad\") -> ") (not-string "not bad")
  (print "(not-string \"nit this\") -> ") (not-string "nit this")
  (print "(not-string \"Hot this\") -> ") (not-string "Hot this")
  (print "(not-string \"no this\") -> ") (not-string "no this")

  ;;Missing Character
  (defn missing-char [text n]
    (println (str "(missing-char \"" text "\") -> ")
              (str (subs text 0 n) (subs text (+ n 1) (count text)))))

  (missing-char "kitten" 1)
  (missing-char "kitten" 0)
  (missing-char "kitten" 4)
  (missing-char "kitten" 2)
  (missing-char "kitten" 3)
  (missing-char "kitten" 5)

  (defn front-back [text]
    (println (str "(front-back \"" text "\") -> ")
      (if (<= (count text) 1)
      (str text)
       (str (.charAt text (- (count text) 1))
            (str (subs text 1 (- (count text) 1))
                 (.charAt text 0))))))


  (front-back "code")
  (front-back "a")
  (front-back "ab")
  (front-back "dude")
  (front-back "abfdg")
  (front-back "rager")

  ;;Front Three
  (defn front-three [text]
    (println (str "(front-three \"" text "\") -> ")
      (if (<= (count text) 3)
        (str text text text)
        (str (subs text 0 3) (subs text 0 3) (subs text 0 3)))))

  (front-three "Java")
  (front-three "Chocolate")
  (front-three "abc")
  (front-three "Thi")
  (front-three "dude")
  (front-three "surf")
  (front-three "Thgsdf")

 ;;Back Around
  (defn back-around [text]
    (println (str "(back-around \"" text "\") -> ")
       (str (.charAt text (- (count text) 1)) text (.charAt text (- (count text) 1)))))

  (back-around "cat")
  (back-around "Hello")
  (back-around "a")
  (back-around "This is")
  (back-around "woah")
  (back-around "This")
  (back-around "smashing")

  ;;Front22
  (defn front-22 [text]
    (println (str "(front-22 \"" text "\") -> ")
             (if (< (count text) 2)
               (str (subs text 0 1) (subs text 0 1) (subs text 0 1))
               (str (subs text 0 2) text (subs text 0 2)))))

  (front-22 "kitten")
  (front-22 "Ha")
  (front-22 "abc")
  (front-22 "grrr")
  (front-22 "Tjfggh")
  (front-22 "Tc")

  (defn del-del [text]
    (println (str "(del-del \"" text "\") -> ")
             (if (and (>= (count text) 4) (.equals (subs text 1 4) "del"))
               (str (subs text 0 1) (subs text 4))
               (str text))))

  (del-del "adelbc")
  (del-del "adelHello")
  (del-del "adedbc")
  (del-del "Tdelme")
  (del-del "wdeloah")
  (del-del "sdelhits")

  ;;Need to come back to fix!!!!!!!!!
  ;; Start oz function
  (defn start-oz [text]
    (println (str "(start-oz \"" text "\") -> ")
             (if (and (>= (count text) 1) (.equals (.charAt text 0) "o"))
               (str (.charAt text 0))
               (if (and (>= (count text) 2) (.equals (.charAt text 1) "z"))
                    (str (.charAt text 1))
                    (if (and (>= (count text) 2) (.equals (.charAt text 1) "z") (.equals (.charAt text 0) "o"))
                      (str (.charAt text 0) (.charAt text 1))
                      (str (subs text 0 2)))))))
  (start-oz "oThuis")
  (start-oz "Tohuis")
  (start-oz "huhdd")
  (start-oz "ozymandias")
  (start-oz "bzoo")
  (start-oz "oxx")
  (start-oz "kitten")

  (defn end-up [text]
    (println (str "(end-up \"" text "\") -> ")
             (if (<= (count text) 3)
               (str/upper-case text)
               (str (subs text 0 (- (count text) 3))(str/upper-case (subs text (- (count text) 3)))))))

  (end-up "Hello")
  (end-up "hi there")
  (end-up "hi")
  (end-up "thikdkds")
  (end-up "thi")
  (end-up "thisdf")



  )
(-main)