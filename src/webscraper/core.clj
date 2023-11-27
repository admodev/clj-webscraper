(ns webscraper.core
  (:require [clj-http.client :as client]))

(defn foo []
  (println (client/get "https://google.com")))

(defn -main []
  (foo))
