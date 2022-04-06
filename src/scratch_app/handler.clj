(ns scratch-app.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [cheshire.core :as json]
            [ring.middleware.json :as ring-json]
            [ring.util.response :as rsp]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/hi" req
       (rsp/response {:name "xiaoguansg" :t (get (:params req) :time)}))
  (route/not-found "Not Found"))

(def app (-> app-routes
             (ring-json/wrap-json-response)
             (wrap-defaults site-defaults)))
