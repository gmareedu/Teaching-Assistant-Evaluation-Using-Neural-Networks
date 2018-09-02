# Teaching-Assistant-Evaluation-Using-Neural-Networks

#### 1.1 Functional Requirements:
  • The weights of each and every weight are randomly assigned.
  • Function to adjust the weights based on the error must also be provided (learning function).
  • The basic input data values must be provided.
  • The target values also should be provided.
  • The number of patterns that are obtained also should be specified.
  • The activation function that is used to calculate the output at every stage should be chosen
    beforehand.

#### 1.2 Non Functional Requirements:
  • Hardware requirement:
Windows 7, Pentium 4 processor.
  • Software requirement:
    JDK 1.6, Eclipse(optional).

#### 2. Implementation
The neural network consists of junctions which are connected with “LINKS”, also called
processing units. For each junction a number is ordered, this number is called weight. The
weights are the tools for the long distance information storing in the neural network, the
learning process occurring with the appropriate modification of weights. These weights are
modified so that the network input/output behaviour is in consonance with the environment,
which provide the input data.
The calculation algorithm consists of two basic steps:
1. Calculation of the output of the network, with inputs and weights.
2. Modification of weights with learning algorithm.
The input neuron consists of a scalar input input[i] multiplied by the scalar weight w[i] and all
such products are added to form sum which is then sent to the activation function.
When using the sigmoid function, the sum is calculated as follows:
sum+=(1/(1+(Math.exp(-inputs[i]*w[i]))))
for all the inputs given.

#### 3. Pseudo-Algorithm
1) Initialize all weights with random values in network;
2) Assign a set of inputs and output value pairs;
3) Call the learning function by passing the input-output pairs as arguments;
4) For each value in the input-output pair {
  a. Calculate the guess value by calling the feedforward function for the input values;
  b. Error=guess-observed; //Calculate error
  c. If (error is greater than 0.01) {
      i. Adjust the weights and perform the loop again until all weights are adjusted
         accurately.
      ii. W[i]+=c*error*input[i];}}
5) Ask the user to enter the inputs;
6) Based on the inputs Call the feedforward function;
7) Call the activation function;
a. Based on the value obtained from feedforward function, print the output;
8) End the program;
