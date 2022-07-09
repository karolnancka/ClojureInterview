(defn checkTheBrackets [s]
  (->> s
       (reduce
         (fn [stack element]
           (cond
             (#{ \( \{ \[ } element) (conj stack element)

             (and (#{ \( \{ \[ } (last stack))
                  (= ({ \) \(, \} \{, \] \[ } element) (last stack)))
             (pop stack)

             :else (conj stack element)))
         [])

       empty?))



(defn firstCheck
  "checks the first string"
  []
  (checkTheBrackets "()")
  )

(defn secondCheck
  "checks the second string"
  []
  (checkTheBrackets "()[]{}")
  )

(defn thirdCheck
  "checks the third string"
  []
  (checkTheBrackets "(]")
  )

(defn fourthCheck
  "checks the fourth string"
  []
  (checkTheBrackets "([)]")
  )

(defn fifthCheck
  "checks the fifth string"
  []
  (checkTheBrackets "{[]}")
  )

(defn sixthCheck
  "checks the sixth string"
  []
  (checkTheBrackets "{[}]()")
  )



