(ns proton.layers.fun.power_mode.core
  (:use [proton.layers.base :only [init-layer! get-initial-config get-keybindings get-packages get-keymaps describe-mode]]))

(defmethod init-layer! :fun/power_mode
  [_ config]
  (println "init power mode"))

(defmethod get-packages :fun/power_mode
  []
  [:activate-power-mode])

(defmethod get-keymaps :fun/power_mode [] [])
(defmethod get-initial-config :fun/power_mode [] [])
(defmethod get-keybindings :fun/power_mode []
  {:t {:category "toggles"
       :p {:action "activate-power-mode:toggle"
           :title "power-mode"}}})
(defmethod describe-mode :fun/power_mode [] {})
