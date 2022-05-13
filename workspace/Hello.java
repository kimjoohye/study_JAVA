SELECT COUNT(*)                  ||'EA (' ||COUNT(*)/COUNT(*)                                            || '%)' AS TOTAL,
       COUNT(DECODE(LOC,'02',1)) ||'EA (' ||COUNT(DECODE(LOC,'02',1) )/COUNT(*)*100                      || '%)' AS SEOUL,
       COUNT(DECODE(LOC,'031',1))||'EA (' ||COUNT(DECODE(LOC,'031',1))/COUNT(*)*100                      || '%)' AS GYEONGGI,
       COUNT(DECODE(LOC,'051',1))||'EA (' ||COUNT(DECODE(LOC,'051',1))/COUNT(*)*100                      || '%)' AS BUSAN,
       COUNT(DECODE(LOC,'052',1))||'EA (' ||COUNT(DECODE(LOC,'052',1))/COUNT(*)*100                      || '%)' AS ULSAN,
       COUNT(DECODE(LOC,'053',1))||'EA (' ||COUNT(DECODE(LOC,'053',1))/COUNT(*)*100                      || '%)' AS DAEGU,
       COUNT(DECODE(LOC,'055',1))||'EA (' ||COUNT(DECODE(LOC,'055',1))/COUNT(*)*100                      || '%)' AS GYEONGNAM
FROM (
    SELECT SUBSTR(tel,1,INSTR(tel,')')-1) AS LOC
    FROM student
)
;