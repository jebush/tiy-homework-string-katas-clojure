(ns tiy-homework-string-katas-clojure.core)
(require '[clojure.string :as str])

(defn -main []

  ;; This is Explode
  (defn explode [str]

    )

  ;; This is the not string
  (defn not-string [str]
    (if (.startsWith str "not")
      (println str)
      (println "not" str)))
  (print "(not-string \"candy\") -> ") (not-string "candy")
  (print "(not-string \"x\") -> ") (not-string "x")
  (print "(not-string \"not bad\") -> ") (not-string "not bad")
  (print "(not-string \"nit this\") -> ") (not-string "nit this")
  (print "(not-string \"Hot this\") -> ") (not-string "Hot this")
  (print "(not-string \"no this\") -> ") (not-string "no this")

  ;;Missing Character
  ;;  (defn missing-char [str n]
  ;;    (def (= front (.substring str (0 n))))
  ;;    (def (= back (.substring str ((+ n 1) (.length str)))))
  ;;    (println front back)
  ;;    )
  ;;  (missing-char "kitten" 2)

;;  (defn front-back [str]
;;    (if (<= (count str) 1)
;;      (println str))
;;    (def mid
;;      (subs 1 (- (count str) 1)))
;;    (println (.charAt str (1))
;;    ))
;;
;;
;;    (front-back "ab")
;
 ; ;;Front Three
 ;(defn front-three [str]
 ;    (if (<= (count str) 3)
 ;    (str (+ str str str))
 ;    (println str)))
;;;   (def front)
;;;   (= front (subs str 0 3))
 ;;;  (println (+ (subs str 0 3) (subs str 0 3) (subs str 0 3))))
 ;(front-three "Thi")
;
 ; ;;Back Around
;;  (defn back-around [str]
;;    (def front)
;;    (println (subs str 0 3)))
;;  (back-around "This is")

  ;;Front22
  (defn front-22 [str]
    (def front "")
    (=  front (subs str 0 2))
    (println front)
    )

  (front-22 "Tjfggh")


  )
(-main)