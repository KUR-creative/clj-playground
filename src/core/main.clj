(ns core.main
  (:require [core.other2 :refer :all]
            clojure.tools.namespace.repl))
(def a 100)
(def b 200)

(defn f [arg]
  ;(prn arg )
  (prn a b o2a o2b oa ob)
  ;(prn a b o2a o2b oa)
  ;(prn (ns-interns *ns*))
  ;(clojure.pprint/pprint (ns-publics 'core.main))
  ;(prn (ns-publics 'core.main))
  )

(f 1)
