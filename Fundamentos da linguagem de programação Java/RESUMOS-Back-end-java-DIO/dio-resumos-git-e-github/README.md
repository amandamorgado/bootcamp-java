
# 👩‍🎓Resumos | Git e github



Baseado nos conteúdos passados no curso de versionamento de código com o git e o git hub, oferecido pelo [DIO](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/599dd3dd-d189-474f-a55c-22f37b4472da?autoplay=1).




## 📖 Documentação

- [Documentação Github](https://docs.github.com/pt)

- [Documentação Git](https://git-scm.com/docs/git/pt\_BR) 



## 💾 Resumos

- **Capítulo 2:** Primeiros passos com Git e Git hub

| aulas | resumo | link|
|---|---|---|
|1- clonando repositórios | criar (mkdir); clonar (git clone); iniciar (git init) | [github](https://docs.github.com/pt/get-started/start-your-journey/uploading-a-project-to-github) e [dio](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/a377a00b-461c-4ab0-8258-3addd2fef14c?autoplay=1)
|2 - Read.me|criando, editando e enviando para o github | [github](https://docs.github.com/pt/get-started/writing-on-github) e [dio](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/599dd3dd-d189-474f-a55c-22f37b4472da?autoplay=1) |
|3- desfazendo alterações | Desfazer alterações nos arquivos e commits, git restore e git reset (tipo: soft, mixed, hard)| [git - reset](https://git-scm.com/docs/git-reset), [git - restore](https://git-scm.com/docs/git-restore) e [DIO](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/3f9f2336-6fd5-44cb-ba39-d1a4f6448023?autoplay=1)|
|4- enviando para o rep remoto | para enviar ao git hub crie um diretório no git hub, coloca 'git remote add origin' (origin ou o nome que você quiser) + url do seu rep no github e para enviar os commits é colocar 'git push -u origin main' (origin é o rep remoto e main é o rep local) | [Github](https://docs.github.com/pt/get-started/using-git/pushing-commits-to-a-remote-repository), [Git](https://git-scm.com/docs/git-remote) e [DIO](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/dd17c56e-2327-493c-942a-358a49a26549?autoplay=1)| 
| 5- trabalhando com branches | é possível adicionar conteúdo em diferentes branchs, tipo atualizar uma teste e depois incluir as alterações na main. comandos: 'git branch', 'git branch - d' + nome da branch a deletar, 'git merge' + nome da branch que ira mesclar com a que está aberta, 'git checkout' + mais nome da branch em que você vai. As vezes podem ocorrer conflitos e você deve escolher quais manter| [Git](https://git-scm.com/docs/git-branch) e [DIO](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/2c7fd2b1-e7c4-4947-9b07-ffcbfb4bd689?autoplay=1)|
|6- extra sobre branchs| 'git pull' é uma junção do 'fetch' que baixa os arquivos e do merge. É possível ver a diferença entre as branchs com 'git diff'. No git clone você pode escolhar qual branch clonar, basta colocar o nome da branch e '--single-branch'|[Git](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell) e [DIO](https://web.dio.me/track/santander-2025-java-back-end/course/406684a4-396d-4160-94b9-ead934e18564/learning/80018fab-daac-4917-8527-a6be2e0c3cf0?autoplay=1)|



## 🕹️ Comandos

Veja abaixo os principais comandos do git e github

| Comando | modo | função|
|---|---|---|
|git init | colocar no terminal do git bash | incializa a sua pasta como um repositório|
|'git clone' + url + --branch + nome da branch + nome local| inserir isso no git com a url do repositório que você quer clonar  | Cria uma versão local para o código que você está usando, é possível escolher todas ou apenas uma branch|
| 'cd' + nome da pasta que quer abrir ou 'cd ..' para voltar uma pasta | inserir no terminal do git bash | abre e volta em pastas|
|'mkdir' + nome da pasta | inserir no terminal do git bash | cria uma nova pasta dentro da pasta que você estiver usando|
|'git touch' + nome do local e arquivo (resumos/aula-01.md) | git bash | cria um novo arquivo|
| 'git log'| inserir no terminal do git bash | apresenta os seus commits daquele repositório|
|'git status' | inserir no terminal do git bash | mostra todos os arquivos que estão na parte de ação ou os que ainda não foram adicionado|
| 'git add ." (todos) ou 'git add' + nome do arquivo/local | inserir no terminal do git bash | adiciona todos os item que não estavam na aérea de 'trabalho' e permite que fique pronto para você enviar o commit|
| 'git commit -m' + "descrição do commit" | inserir no terminal do git bash | enviar o commit|
|'git reset' + ('-soft', '-mixed' ou -hard') + número do commit ou arquivo | inserir no terminal do git bash | o reset volta a alteração. Tipos: soft - retorna para a última etapa (antes do commit, antes do add...), mixed - retorna duas antes, hard - exclui o commit e o arquivo.|
|'git restore' + nome do arquivo | inserir no terminal do git bash | volta a alteração que havia sido excluída |
| 'echo' +"nome do arquivo que quer copiar" + > + "nome do novo arquivo" | inserir terminal do git bash| cria um novo arquivo com base no anterior|
|'git checkout' + nome da branch | terminal do git bash ao estar logado em uma branch | ele sai da branch que você está e vai para a branch que colocou o nome|
| 'git push origen main' | inserir no terminal do git bash após ter conectado seu rep com um rep remoto | envia os commits do rep remoto para o local|
| 'git pull origen main' (junção de 'git fetch' + 'git merge' | inserir no terminal do git bash após ter conectado seu rep com um rep remoto e feito alterações no remoto | ele traz os arquivos que estão no rep remoto (fetch) e já mescla (merge)|
| 'git diff origen/main' | inserir no terminal do git bash ao trabalhar com duas ou mais branchs | apresenta diferença entre as branches|


