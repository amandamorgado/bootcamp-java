
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



## 🕹️ Comandos

Veja abaixo os principais comandos do git e github

| Comando | modo | função|
|---|---|---|
|'git clone' + url + nome| inserir isso no git com a url do repositório que você quer clonar  | Cria uma versão local para o código que você está usando|
|'mkdir' + nome da pasta | git bash | cria uma nova pasta dentro da pasta que você estiver usando|
|'git touch' + nome do local e arquivo (resumos/aula-01.md) | git bash | cria um novo arquivo|
| 'git log'| git bash | apresenta os seus commits daquele repositório|
|'git status' | git bash | mostra todos os arquivos que estão na parte de ação ou os que ainda não foram adicionado|
| 'git add ." (todos) ou 'git add' + nome do arquivo/local | git bash | adiciona todos os item que não estavam na aérea de 'trabalho' e permite que fique pronto para você enviar o commit|
| 'git commit -m' + "descrição do commit" | git bash | enviar o commit|
|'git reset' + ('-soft', '-mixed' ou -hard') + número do commit ou arquivo | git bash | o reset volta a alteração. Tipos: soft - retorna para a última etapa (antes do commit, antes do add...), mixed - retorna duas antes, hard - exclui o commit e o arquivo.|
|'git restore' + nome do arquivo | git bash | volta a alteração que havia sido excluída |


