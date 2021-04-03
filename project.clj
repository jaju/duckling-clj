(defproject org.msync/duckling "0.4.25-SNAPSHOT"

  :description "General entities parser"

  :license {:url      "https://github.com/jaju/duckling-clj"
            :comments "see LICENSE"}

  :url "https://github.com/jaju/duckling-clj"

  :plugins [[lein-midje "3.2.1"]]

  :repl-options {:init-ns duckling.core}

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [clj-time "0.15.2"]
                 [prismatic/plumbing "0.5.5"]]

  :deploy-repositories [["clojars" {:creds :gpg}]]

  :profiles {:dev     {:dependencies [[org.clojure/tools.trace "0.7.11"]
                                      [org.clojure/tools.nrepl "0.2.13"]
                                      [org.clojure/tools.logging "1.1.0"]
                                      [midje "1.9.10"]
                                      [cheshire "5.10.0"]]}
             :uberjar {:aot [duckling.core]}}

  :test-selectors {:default   (complement :benchmark)
                   :benchmark :benchmark}

  :scm {:name "git"
        :url  "https://github.com/jaju/duckling-clj"}

  :pom-addition [:developers
                 [:developer
                  [:name "Wit.ai"]
                  [:url "https://wit.ai"]
                  [:email "contact@wit.ai"]
                  [:timezone "-7"]]
                 [:developer
                  [:name "Ravindra Jaju"]
                  [:url "https://msync.org/"]
                  [:email "dev@msync.org"]
                  [:timezone "+5:30"]]])
