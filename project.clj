(defproject org.msync/duckling "0.4.26-SNAPSHOT"

  :description "General entities parser"

  :license {:url "https://github.com/jaju/duckling-clj"
            :comments "see LICENSE"}

  :url "https://github.com/jaju/duckling-clj"

  :repl-options {:init-ns duckling.core}

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [clj-time "0.15.2"]
                 [org.clojure/tools.logging "1.1.0"]]

  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]

  :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.11"]
                                  [org.clojure/tools.nrepl "0.2.13"]
                                  [prismatic/plumbing "0.5.5"]]}
             :uberjar {:aot [duckling.core]}}

  :test-selectors {:default (complement :benchmark)
                   :benchmark :benchmark}

  :scm {:name "git"
        :url "https://github.com/jaju/duckling-clj"}

  ;; wit.ai is the original dev entity - but we have now forked what they have archived
  :pom-addition [:developers
                 [:developer
                  [:name "Ravindra Jaju"]
                  [:url "https://msync.org/"]
                  [:email "dev@msync.org"]
                  [:timezone "+5:30"]]])