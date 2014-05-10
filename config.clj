{:input-dir "site/input"
 :output-dir "site/output"
 :templates-dir "site/templates"
 :pages-in-list 6
 :tags-pages [{:tag "index"
               :list-template "index"}
              {:tag "news"
               :list-template "newslist"
               :page-template "newsitem"}
              {:tag "gallery"
               :list-template "gallery"}]
 :single-pages [{:file-name "about"
                 :template "about"}]
 }
