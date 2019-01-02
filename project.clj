(defproject wit/duckling "0.4.25-SNAPSHOT"
  :description "Date & Number parser"
  :license {:url "https://github.com/jaju/duckling-clj"
            :comments "see LICENSE"}
  :url "https://github.com/jaju/duckling-clj"
  :plugins [[lein-midje "3.2.1"]]
  :repl-options {:init-ns duckling.core}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.nrepl "0.2.13"]
                 [org.clojure/tools.logging "0.4.1"]
                 [clj-time "0.15.1"]
                 [prismatic/plumbing "0.5.5"]]
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.10"]
                                  [midje "1.9.4"]
                                  [cheshire "5.8.1"]]}
             :uberjar {:aot [duckling.core]}}
  :test-selectors {:default (complement :benchmark)
                   :benchmark :benchmark}
  :scm {:name "git"
        :url "https://github.com/wit-ai/duckling"}
  :pom-addition [:developers [:developer
                               [:name "Wit.ai"]
                               [:url "https://wit.ai"]
                               [:email "contact@wit.ai"]
                               [:timezone "-7"]]])
