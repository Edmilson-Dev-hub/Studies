import pandas as pd
import plotly.express as px
from sklearn.linear_model import LinearRegression

tabela_exemplo = pd.read_csv("exemplo.csv")

y = tabela_exemplo["Vendas"]
lista_colunas = ["Mês"]
x = tabela_exemplo[lista_colunas]

modelo = LinearRegression()
modelo.fit(x, y)

meses_prever = pd.DataFrame({"Mês": [25, 26, 27]})
previsoes = modelo.predict(meses_prever)
tabela_previsoes = pd.DataFrame({"Mês":[25, 26, 27], "Vendas": previsoes})
print(tabela_previsoes)

tabela_exemplo["Tipo"] = "Histórico"
tabela_previsoes["Tipo"] = "Previsão"
tabela_final = pd.concat([tabela_exemplo, tabela_previsoes])

grafico = px.scatter(tabela_final, x="Mês", y="Vendas", color="Tipo", trendline="ols")
grafico.show()