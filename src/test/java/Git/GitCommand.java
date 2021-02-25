package Git;

public class GitCommand {

	//find the diff
	
	
	//https://dzone.com/articles/top-20-git-commands-with-examples
	
/*	git checkout -- . : remove all changes happened in local(in all files)

	To create a new branch named “feature_x” and switch to it using
	$ git checkout -b feature_x

	What is a rebase in Git?
	In Git, the rebase command integrates changes from one branch into another. It is an alternative to the better known "merge" command.

	Most visibly, rebase differs from merge by rewriting the commit history in order to produce a straight, linear succession of commits.

	GIT REBASE
	For example, consider a situation where the master branch has progressed since you started working on a feature branch. 
	You want to get the latest updates to the master branch in your feature branch, but you want to keep your branch's history 
	clean so it appears as if you've been working off the latest master branch.

	##Create a new repository on the command line

	touch README.md
	git init
	git add README.md
	git commit -m "first commit"
	git remote add origin git@github.com:alexpchin/<reponame>.git
	git push -u origin master
	
	
	git diff branch1_ branch_2 -to compare two branch
	git diff master filepath - to compare file in two branch
	
	git remove rm origin - to remove origin*/
	
	/*GIT STASH:
	git stash save "text" -to stash local changes
	git stash list - to see list
	git stash pop -pops up recent/first stash
	git stash apply "@stashid"*/
	
	
	//-----------------------------------------------------------------------------------------------------
	
	/*
	1)git init -to initialize the project
	
	2)git add . -adds all files to stage 
	3)git add * -adds one or more
	4)git add <file> -add particular file
	
	5)git status -check files staged or not
	
	how to unstage  a staged file
	
	git reset -will reset all file from staged env
	
	git reset HEAD <path>  -will unstage specified file <HEAD is optional>
	
	Note: Recent Git versions (1.8.4.x) have changed this message:

    (use "git rm --cached <file>..." to unstage) ex: git rm --cached src/test/java/Git/GitCommand.java

	ex:
		In order to unstage the README file, you would execute the following command

		$ git reset -- README
	
	In order to remove unstaged changes, use the “git checkout” command and specify the paths to be removed.

        $ git checkout -- <path>
	
	git restore src/test/java/Git/GitCommand.java  -to delete changes from working directory
	
	
	*/
}
