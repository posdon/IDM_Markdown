# IDM_Markdown

This project is an application for IDM's classes from INSA Rennes. The objectives are to create the meta-model of Markdown, then translate it into several languages (Latex, HTML, ...). For this project we based on this Markdown's syntaxe : https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet.

## Contributors

This project is done by M.RACHID, M.LAROUI and A.GIMENEZ, and is supervised by A.BLOUIN and A.???
Thanks to Romain LEBOUC for the suggestion of the project's name.

## Markdown Grammar

```

File : ( MdExpr ) *

MdExpr : ( HeaderExpr | TableExpr | ListExpr | Images | Video | References | Code | HTML | Link | Quote | HRule | LB )? | ExprWithLB


HeaderExpr : #(1..6) ExprUnbroken #* | ExprUnbroken '\n' (-|=)+

ListExpression : HeaderList | ContentList 
HeaderList : OneLineExpression | HeaderList | -- || OneLineExpression | --
ContentList : OneLineExpression | ContentList || OneLineExpression


```
