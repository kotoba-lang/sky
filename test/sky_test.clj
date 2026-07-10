(ns sky-test
  (:require [clojure.test :refer [deftest is]]
            [clojure.string :as str]
            [kami.sky :as sky]))

(deftest gradient-shader-emits-wgsl
  (let [s (sky/gradient-shader)]
    (is (str/includes? s "@vertex"))
    (is (str/includes? s "@fragment"))
    (is (str/includes? s "mix(u.zenith, u.ground"))))
