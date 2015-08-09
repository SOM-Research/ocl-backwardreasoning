# Backwards reasoning for model transformations
Model transformations are key elements of Model Driven Engineering. Current challenges for transformation languages include improving usability (i.e., succinct means to express the transformation intent) and devising powerful analysis methods. 

In this work, we show how backwards reasoning helps in both respects. The reasoning is based on a method that, given an OCL expression and a transformation rule, calculates a constraint that is satisfiable before the rule application if and only if the original OCL expression is satisfiable afterwards.
With this method we can improve the usability of the rule execution process by automatically deriving suitable application conditions for a rule (or rule sequence) to guarantee that applying that rule does not break any integrity constraint (e.g. meta-model constraints). When combined with model finders, this method facilitates the validation, verification, testing and diagnosis of transformations.

Concerned patterns
------------------
* Object deletion
* Attribute updates
* Link deletion
* Link creation
* Object creation


Status of the tool
------------------

Actually the tool covers the patterns for deleting objects, deleting/creating links, updating attributes. We are working on the rest, and particullary patterns for objects creation. 


