# O Que são Listeners

- Os listeners permitem que o seu código seja
avisado quando algum evento do seu
interesse ocorre

- Se você criar e registrar um listener, o
container o invoca na presença de um
evento


# Existem oito tipos de listeners

- Interfaces dos Listeners
- ServletContextListener
- ServletContextAttributeListener
- ServletRequestListener
- ServletRequestAttributeListener
- HttpSessionListener
- HttpSessionAttributeListener
- HttpSessionBindingListener
- HttpSessionActivationListener

<p><strong>Os listeners são
interfaces. Basta
implementar a interface
desejada e registrá-la</strong></p>


# Configurando um Listener

- Para que o container saiba da existência do
listener, é preciso registrá-lo no web.xml

## Listeners e Annotations

- Outra forma de configurar um listener é
através de annotations

## Listeners da HTTP Session

<p>Servidores de aplicações podem decidir o
que fazer com dados da session</p>

– Remover da memória (armazenar em disco)
– Migrar os dados para outra JVM (ambiente
distribuído)


### HttpSessionBindingListener

– É o único listener que não precisa ser
configurado - Nem no web.xml nem via @WebListener


– Classes cujos objetos precisam ser notificados
quando são adicionados ou removidos de uma
session implementam esta interface


