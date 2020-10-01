# About 

Manuscript is the digital analogue to a bound notebook of staff paper. It uses OCR to transform your handwritten notes to digitalized notes in real time.

It takes the form of an Android app that turns handwriting into neatly written sheet music. 

This project is for my Senior Capstone project at Hendrix College.

For training the OCR, I am using a sorted version of the [HOMUS dataset](https://grfia.dlsi.ua.es/homus/) by Jorge Calvo:

**Scientific Publication**: J. Calvo-Zaragoza and J. Oncina, "Recognition of Pen-Based Music Notation: The HOMUS Dataset," 2014 22nd International Conference on Pattern Recognition, Stockholm, 2014, pp. 3038-3043. [DOI: 10.1109/ICPR.2014.524](http://dx.doi.org/10.1109/ICPR.2014.524)

The specific version that I am using is a fork of Alexander Pacha's fork, which cleans up extranious markings in the data. My fork can be found [here](https://github.com/ivyjsgit/Homus).

## iOS Port

Due to difficulties experienced with Tensorflow and with Android development in general, I am deciding to pivot Manuscript in a new direction. I am now directing my efforts towards my original vision of an iOS version of the app using CoreML as the machine learning backend and Swift as the main programming language. This new project is available [here](https://github.com/ivyjsgit/Manuscript-iOS). 
