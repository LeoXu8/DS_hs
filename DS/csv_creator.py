import csv

data = [
    ['type', 'value'],
    ['essay_category', 'Generative AI'],
    ['essay_url', 'https://www.kaggle.com/code/qrohn2/essay-on-generative-ai/notebook'],
    ['feedback1_url', 'http://www.kaggle.com'],
    ['feedback2_url', 'http://www.kaggle.com'],
    ['feedback3_url', 'http://www.kaggle.com']
]

filename = "submission.csv"

with open(filename, 'w') as csvfile:
    csvwriter = csv.writer(csvfile)
    csvwriter.writerows(data)
