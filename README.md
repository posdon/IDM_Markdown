# IDM_Markdown

This project is an application for IDM's classes from INSA Rennes. The objectives are to create the meta-model of Markdown, then translate it into several languages (Latex, HTML, ...). For this project we based on this Markdown's syntaxe : https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet.

## How to Git it

Just clone our project with `git clone https://github.com/posdon/IDM_Markdown.git`
Open it with eclipse-modeling and generate the files by launching markHammil.mm/src/markHammil/mm/GenerateMyDsl.mwe2

## Contributors

This project is done by M.RACHID, M.LAROUI and A.GIMENEZ, and is supervised by A.BLOUIN and A.???
Thanks to Romain LEBOUC for the suggestion of the project's name.

## Our Markdown Grammar

```
Our language will follow several rules of text.
You will be able to write a normal texte but also put some form on it like below.

Add a title
# title1
## title2
### title3
#### title4
##### title5
###### title6

Add some style
**bold text**
*italic text*
~~scratch text~~

Define some delimiter
--- or ___

Add some lists
- unordered
- list
+ start
+ with + or -
or
1. Ordered list
2. start with
3. numbers

Add a tab
With | a | header
-- | -- | --
And | with | some
content | one | several
lines |

Quotes some friends
> The quotation

Link some reference
[name of a link](URL)
![name of a image](URL)
[![name of a video](URL of a presenting image)](URL of the video)

```

## Example

```
Hello world
# This is a title with a **strong** text in it
What you want to do 
- Check what this language can do
- Spoiler **it can be bold *and* italic** at the same time

You might also want to make some space







or | to | have | a | tab
==|=============
I | tried | to | break **it** but | it fails
```
