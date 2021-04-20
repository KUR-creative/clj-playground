(ns core.other2
  (:require core.other) ;; need for ns-publics
  )

(doseq [[sym var] (ns-publics 'core.other)]
  (intern *ns* sym (var-get var)))

(def o2a 1)
(def o2b 2)
