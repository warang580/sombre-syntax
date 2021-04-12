# TODO

- comment color could pop a little more
    - #6b7f80 (slight green)
    - yelloish used by scrollbar indicator: #d1c3ae
    - Make single comments italic again
- PHP: use/namespace keywords should be darker + class should be bold
- PHP $ for variables should be treated as punctuation: syntax--punctuation syntax--definition syntax--variable
- Same for CSS &. syntax--punctuation syntax--definition syntax--entity syntax--css
- markdown code should be stylized somehow
    `.syntax--markup .syntax--raw`
    - probably a lighter gray
- this rule is "too powerful" :
    `.syntax--meta.syntax--class > * { font-weight: normal; }`
    maybe use something like:
    `.syntax--meta.syntax--class > :not(.syntax--class)`
    except this one : syntax--storage syntax--type syntax--class syntax--php
    which is the "class" keyword (at least in php)
- braces are not *always* (?) stylized when the cursor is on them (bracket-matcher)
    - maybe it's because `atom-text-editor.editor` ? (add with .editor + without it ?)
    - it could be an accent color
- diff in gutter could be in (light) colors
- slightly less visible links
