(defproject aiamg "0.1.0-SNAPSHOT"
  :description "Clojure part of Aiamg"
  :url "https://www.aia.dk"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :java-source-paths ["../../"]
  :main ^:skip-aot aiamg.core
  :target-path "target/%s"
  :repl-options {:init-ns aiamg.entry})
