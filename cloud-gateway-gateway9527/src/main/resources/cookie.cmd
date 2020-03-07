# 不带任何参数
curl http://localhost:9527/payment/lb
# 携带cookie
curl http://localhost:9527/payment/lb --cookie "username=spectrumrpc"
# 携带请求头
curl http://localhost:9527/payment/lb -H "X-Request-Id:123456"
# host
curl http://localhost:9527/payment/lb -H "Host: www.baidu.com"

curl http://localhost:9527/payment-lb?username=1