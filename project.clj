(defproject scratch-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.9.5"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [cheshire "5.10.2"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [mysql/mysql-connector-java "5.1.26"]
                 [korma "0.4.3"]
                 [ring/ring-json "0.5.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler scratch-app.core/app}
  :profiles {:dev {:dependencies [[ring/ring-mock "0.3.2"]]
                   }}
  :main ^:sikp-aot scratch-app.core
  :aot [scratch-app.core]
  :repl-options {:init-ns scratch-app.core})
