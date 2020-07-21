(defproject io.logicblocks/cartus.test "0.1.6"
  :description "A structured logging abstraction with multiple backends."

  :plugins  [[lein-modules "0.3.11"]
             [lein-cloverage "1.1.2"]
             [lein-shell "0.5.0"]
             [lein-cprint "1.3.3"]
             [lein-ancient "0.6.15"]
             [lein-eftest "0.5.9"]
             [lein-cljfmt "0.6.7"]
             [lein-kibit "0.1.8"]
             [lein-bikeshed "0.5.2"]
             [jonase/eastwood "0.3.11"]]

  :dependencies [[io.logicblocks/cartus.core :version]])
